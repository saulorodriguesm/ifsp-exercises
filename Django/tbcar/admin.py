from django.contrib import admin
from tbcar.models import Cliente, Veiculo, Parametro, Mensalista,\
    Rotativo

admin.site.register(Cliente)
admin.site.register(Veiculo)
admin.site.register(Parametro)
admin.site.register(Rotativo)
admin.site.register(Mensalista)
