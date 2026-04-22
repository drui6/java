public class EB_InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }
 
    private static void addInstance() {
        numInstances++;
    }
    
    EB_InstanceCounter() {
        EB_InstanceCounter.addInstance();
    }
    
    public static void main(String[] arguments) {
        System.out.println("Starting with " +
        EB_InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new EB_InstanceCounter();
        }
        System.out.println("Created " +
        EB_InstanceCounter.getCount() + " instances");
    }
}
