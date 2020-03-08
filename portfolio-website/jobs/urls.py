from django.urls import path
from . import views

urlpatterns = [
    path('automation', views.automation, name='automation'),
]
