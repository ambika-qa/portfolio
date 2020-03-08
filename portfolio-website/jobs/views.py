from django.shortcuts import render
from .models import Job

# Create your views here.
def home(request):
    jobs = Job.objects
    return render(request, 'jobs/home.html', {'jobs':jobs})

def automation(request):
    automation_objects = Job.objects
    return render(request, 'jobs/automation.html', {'jobs':automation_objects})
