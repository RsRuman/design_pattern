/**
 * Singleton class
 * Not thread safe
 * if two thread execute both may create different object
 *
 */

//public class Singleton {
//    private static Singleton instance;
//
//    //Making construct private to prevent inialize
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}


/**
 * Thread safe singleton
 * Using synchornize method or block
 * Double checked lock
 * Using volatile (Without caching take from main)
 *
 */

//public class Singleton {
//    private static volatile Singleton instance;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}


/**
 * Use bill pugh singleton
 * Inner class
 * Thread safe
 * Lazy loaded
 * No synchronization overhead
 *
 */

//public class Singleton {
//    private Singleton(){}
//
//    public static class Holder {
//        private static Singleton instance = new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return Holder.instance;
//    }
//}

/**
 * Using enum
 * Protect against serialization issues
 * Protect against reflection attacks
 * Simple implementation
 *
 */

public enum Singleton {
    INSTANCE;

    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}