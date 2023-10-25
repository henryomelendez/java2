public final class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle(){
    }
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    @Override
    String draw() {
        String s = "";
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= width; j++){
                if(i == 1 || i == length || j == 1 || j == width ){
                    s+= "*";
                }
                else {
                    s+= " ";
                }
            }
            s+= "\n";
        }
        return s;
    }
}
