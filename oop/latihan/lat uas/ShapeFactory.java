public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }

        Class c;
        try {
            c = class.forName(shapeType);
            return (shapeType) c.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}