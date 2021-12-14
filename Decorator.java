import java.util.ArrayList;

public class Decorator {

    public Decorator() {
        int[][] bits = new int[10][10];
        SquareImage squareImage = new SquareImage();
        squareImage.importImg(bits);
        squareImage.exportImg();
        BlurSqaureImage blurSqaureImage = new BlurSqaureImage(squareImage);
        blurSqaureImage.importImg(bits);
        blurSqaureImage.exportImg();
    }

    interface Image {
        public void importImg(int[][] bits);

        public int[][] exportImg();
    }

    private abstract class ImageDecorator implements Image {
        private Image decoratedImage;

        public ImageDecorator(Image decoratedImage) {
            this.decoratedImage = decoratedImage;
        }

    }

    private class BlurSqaureImage extends ImageDecorator {

        public BlurSqaureImage(Image decoratedImage) {
            super(decoratedImage);
        }

        @Override
        public void importImg(int[][] bits) {

        };

        @Override
        public int[][] exportImg() {
            return null;
        };
    }

    private class SquareImage implements Image {

        @Override
        public void importImg(int[][] bits) {

        };

        @Override
        public int[][] exportImg() {
            return null;
        };
    }

    private class CircleImage implements Image {

        @Override
        public void importImg(int[][] bits) {

        };

        @Override
        public int[][] exportImg() {
            return null;
        };
    }
}