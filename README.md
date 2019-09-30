The following is done in the code.

## Inversion of Control with XML Configuration
1. Define a new implementation for the Coach interface. You can use whatever
sport you would like.
2. Reference your new implementation in the Spring config file.
3. Test your application to verify you are retrieving information from your new
Coach implementation

## HEADS UP - Add Logging Messages in Spring 5.1
### The Problem
In Spring 5.1, the Spring Development team changed the logging levels internally. As a result, by default you will no longer see the red logging messages at the INFO level. This is different than in the videos.
   
### The Solution
If you would like to configure your app to show similar logging messages as in the video, you can make the following updates listed below. Note, you will not see the EXACT same messages, since the Spring team periodically changes the text of the internal logging messages. However, this should give you some additional logging data.
   
### Overview of the steps
1. Create a bean to configure the parent logger and console handler
2. Configure the bean in the Spring XML config file

### Detailed Steps:
**1. Create a bean to configure the parent logger and console handler** <br />
This class will set the parent logger level for the application context. It will also set the logging level for console handler. It sets the logger level to FINE. For more detailed logging info, you can set the logging level to level to FINEST.  You can read more about the logging levels at http://www.vogella.com/tutorials/Logging/article.html
This class also has an init method to handle the actual configuration. The init method is executed after the bean has been created and dependencies injected. <br />
**2. Configure the bean in the Spring XML config file** <br />
In your XML config file, add the following bean entry. Make sure to list this as the first bean so that it is initialized first. Since the bean is initialized first, then you will get all of the logging traffic. If you move it later in the config file after the other beans, then you will miss out on some of the initial logging messages.