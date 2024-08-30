class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int [][] a = new [image.length][image.length];
        for(int i =0;i<image.length;i++){
            int s = 0;
            int e = image.length-1;
            while(s<e){
                int t = image[i][s];
                image[i][s]=image[i][e];
                image[i][e]=t;
                s++;
                e--;
             }
        }
                for(int i =0;i<image.length;i++){
                    for(int j =0;j<image.length;j++){
                        if(image[i][j]==1){
                            image[i][j]=0;
                        }else{
                            image[i][j]=1;
                        }
                    } 
                }
        


        return image;
    }
}