package website_automation;

public class log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		#logger comment // logger // appender  // layout
		log4j.rootLogger=debug, file

		# Direct log messages to a log file
		log4j.appender.file=org.apache.log4j.RollingFileAppender

		#Redirect to Tomcat logs folder


		log4j.appender.file.File=D:\\login\\logging.log
		log4j.appender.file.MaxFileSize=10MB
		log4j.appender.file.MaxBackupIndex=10
		log4j.appender.file.layout=org.apache.log4j.PatternLayout
		log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
		 
	}

}