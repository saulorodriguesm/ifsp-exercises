from django.forms import ModelForm
from tbcar.models import Cliente, Veiculo


class FormCliente(ModelForm):
    class Meta:
        model = Cliente
        fields = '__all__'


class FormVeiculo(ModelForm):
    class Meta:
        model = Veiculo
        fields = '__all__'
