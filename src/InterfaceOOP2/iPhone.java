package InterfaceOOP2;

public class iPhone extends CellPhone {
    @Override
    public void call() {
        System.out.println("iPhone is calling");
    }

    @Override
    public void text() {
        System.out.println("iPhone is texting");
    }

    @Override
    public void takePicture() {
        System.out.println("iPhone is taking a picture");
    }

    @Override
    public void location() {
        System.out.println("iPhone does not have a flash card");
    }

    @Override
    public void faceId() {
        System.out.println("iPhone has faceId function");
    }
}
