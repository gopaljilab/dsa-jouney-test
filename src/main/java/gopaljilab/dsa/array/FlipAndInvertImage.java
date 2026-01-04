package gopaljilab.dsa.array;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image){
        /*int[][] result = new int[image.length][image[0].length];

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[0].length; j++) {
                result[i][j] = image[i][image[i].length-j-1];
            }
        }

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[0].length; j++) {
                result[i][j] = (result[i][j]==1) ? 0 : 1;
            }
        }
        return result;*/


        for (int i = 0; i < image.length; i++) {
            int mid = (image[i].length)/2;
            for (int j = 0; j < image[i].length; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = temp;
                if ((mid == j)) break;
            }
        }

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = (image[i][j]==1) ? 0 : 1;
            }
        }

        return image;
    }
}
