public class ShapeFactory {

    public Shape getShape(String typeShape){
        if(typeShape == null){
            return null;
        }
        if(typeShape.equalsIgnoreCase("cerchio")){
            return new cerchio();
        } else if(typeShape.equalsIgnoreCase("rettangolo")) {
            return new rettangolo();
        }
        return null;
    }
}



