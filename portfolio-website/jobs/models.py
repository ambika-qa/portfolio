from django.db import models

# Create your models here.

class Job(models.Model):
    title = models.CharField(max_length=200)
    body = models.TextField()
    #pub_date = models.DateTimeField()
    #image = models.ImageField(upload_to='images/')
    def summary(self):
        return self.body
