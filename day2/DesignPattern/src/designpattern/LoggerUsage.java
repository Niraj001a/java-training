package designpattern;



public class LoggerUsage {
    public static void main(String[] args) {
        ILogger logger=new LoggerImpl();
    
        logger.info("successful");
        logger.error("something went wrong");
        
    }
}
