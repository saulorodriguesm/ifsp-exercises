from django.contrib import messages
from django.shortcuts import render, redirect
from django.contrib.auth.decorators import login_required
from django.urls import reverse_lazy
from tbcar.forms import FormCliente, FormVeiculo
from tbcar.models import Cliente, Veiculo, Parametro, Mensalista, Rotativo
from django.views import generic
from django.contrib.auth.forms import UserCreationForm


def home(request):
    return render(request, 'core/index.html')


class Registrar(generic.CreateView):
    form_class = UserCreationForm
    success_url = reverse_lazy('login')
    template_name = 'registration/register.html'


@login_required
def cadastro_cliente(request):
    if request.user.is_staff and request.user.is_active:
        form = FormCliente(request.POST or None, request.FILES or None)
        if form.is_valid():
            form.save()
            messages.success(request, "Cliente cadastrado com sucesso")
            return redirect('url_listagem_clientes')
        contexto = {'form': form, 'texto_titulo':'Cadastro de Cliente', 'texto_botao':'Cadastrar',
                    'texto_cancelar':'url_principal'}
        return render(request, 'core/cadastro_cliente.html', contexto)
    else:
        return render(request, 'core/nao-autorizado.html')


@login_required
def listagem_clientes(request):
    if request.user.is_staff and request.user.is_active:
        dados = Cliente.objects.all()
        if request.POST:
            if request.POST['cliente_input']:
                dados = Cliente.objects.filter(nome=request.POST['cliente_input'])

        contexto = {'dados': dados}
        return render(request, 'core/listagem_clientes.html', contexto)
    else:
        return render(request, 'core/nao-autorizado.html')


def cadastro_veiculo(request):
    return render(request, 'core/cadastro_veiculo.html')


def listagem_veiculos(request):
    return render(request, 'core/listagem_veiculos.html')



@login_required
def atualiza_cliente(request, id):
    if request.user.is_staff and request.user.is_active:
        obj = Cliente.objects.get(id=id)
        form = FormCliente(request.POST or None , request.FILES or None , instance=obj)
        if form.is_valid():
            form.save()
            messages.success(request, "Cliente atualizado com sucesso")
            return redirect('url_listagem_clientes')
        else:
            contexto = {'form':form, 'texto_titulo':'Atualização de Cliente', 'texto_botao':'Atualizar',
                        'texto_cancelar':'url_listagem_clientes'}
            return render(request, 'core/cadastro_cliente.html' , contexto)
    else:
        return render(request, 'core/nao-autorizado.html')


@login_required
def exclui_cliente(request, id):
    if request.user.is_staff and request.user.is_active:
        obj = Cliente.objects.get(id=id)
        if request.POST:
            obj.delete()
            messages.success(request, "Cliente excluido com sucesso")
            return redirect('url_listagem_clientes')
        else:
            contexto = {'dado': obj.nome , 'id': id, 'url': 'url_listagem_clientes'}
            return render(request, 'core/confirma_exclusao.html' , contexto)
    else:
        return render(request, 'core/nao-autorizado.html')


@login_required
def listagem_parametro(request):
    dados = Parametro.objects.all()
    contexto = {'dados': dados}
    return render(request, 'core/listagem_parametros.html', contexto)