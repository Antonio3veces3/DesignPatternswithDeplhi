// Eagerly crreated Instance

public class ImageLoader {
    private static ImageLoader myInstance = new ImageLoader();

    private ImageLoader(); // Constructor

    public static ImageLoader getInstance(){
        return this.uniqueInstance;
    }
}

// Create unique instance with Double-Checked

public class ImageLoader {
    private static ImageLoader myInstance;

    private ImageLoader(); // Constructor

    public static ImageLoader getInstance(){
        if(myInstance == null){
            synchronized (ImageLoader.class){
                if(myInstance == null){
                    myInstance = new ImageLoader();
                }
            }
        }

        return myInstance;
    }
}