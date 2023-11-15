class Encapsulation {
    public static void main(String args[]) {
        Medicine m = new Medicine("liquid", "pink", "general");
       m.getType();
       System.out.println(m.getType());
       m.setType("plasma");
       System.out.println(m.getType());


    }
}

class Medicine {

   private String type ;
   private String color ;
   private String category ;

    Medicine(String type, String color, String category) {
        this.type = type;
        this.color = color;
        this.category = category;
    }

    public String getType() {
        return type;
    }
    public void setType(String type)
    {
        if(type.equals("solid") || type.equals("liquid")|| type.equals("gas"))
        {
            this.type=type;
        }
        else {
            System.out.println("Wrong type");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
