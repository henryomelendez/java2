public final class Square extends Shape{
    private int sides;
    public Square(){
    }
    public Square(int sides){
        this.sides = sides;
    }
    @Override
    String draw() {
        int length = this.sides;
        int width = this.sides;
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
