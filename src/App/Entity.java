package App;

public class Entity {
    
    private int[] location = new int[2];
    private String type;
    private String subType;

    protected void carry(int[] origin){
        //pass by reference, so object will move with carrier.
    }

    protected int[] getLocation() {
        return location;
        //returns the Entity's location
    }

     
    protected void setLocation(int[] i) {
        
    }

    protected String getSubType(){

        // return       subtype as string  
        return subType;
    } 

    protected String getType(){
        // Tells you the base type
        return type;
    }

    protected void setType(String typeName){
        
    }
        

    protected void setSubType(String s){
    //perhaps forms part of a more general type
}


}





