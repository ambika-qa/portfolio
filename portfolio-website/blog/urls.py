from django.urls import path
from . import views

urlpatterns = [
    path('testcases', views.testcases, name='testcases'),
    path('<int:blog_id>/', views.detail, name='detail')
]
