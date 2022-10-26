package Game;

public class Instance {

    public boolean Archivable;
    public String Name;
    public Instance Parent;
    public static String ClassName;

    Instance[] Children;

    public void ClearAllChildren(){;
      
        for (Instance i : this.GetChildren()){
            i.Destroy(i);
        }
    }
    
    public void Clone(){
        
        if (this.Archivable == true){
            try {
                this.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        else{

            System.out.println("Unable to clone this instance because it is not Archivable.\nPlease set property 'Archivable' to true.");
        }
    }

    public void Destroy(Instance someInstance){

        someInstance = null;

    }

    public Instance FindFirstAncestor(String name){
         return null;

         //TODO
    }

    public Instance FindFirstAncestorOfClass(String className){
        Instance[] children = this.GetChildren();

         for ( Instance i: children){
            if (i.ClassName == className){
                return i;
            }
         }

        return null;
    }

    public Instance FindFirstAncestorWhichIsA(String className){
        return null;

        //TODO
    }

    public Instance FindFirstChild(String name){
        Instance[]  children = this.GetChildren;

        for (Instance i: children){
            if (i.Name == name){
                return i;
            }
        }
        return null;
    }

    public Instance FindFirstChildOfClass(String className){
       Instance[ ] children = this.GetChildren;

       for (Instance i: children  ){
            if (i.ClassName == className){
                return i;
            }
       }
        return null;
    }

    public Instance FindFirstChildWhichIsA(String className){
        return null;

        //TODO
    }

    public Instance FindFirstDescendant(String name){
        return null;

        //TODO
    }


    public Instance[] GetChildren(){
        return this.Children;
    }
    public String GetFullName(){

        return this.getClass().getName();

    }

    public Event GetPropertyChangedSignal(String property){
        return null;

        //TODO
    }

    public boolean IsA(String className){

        if (className == this.GetFullName()){
            return true;
        }else{
            return false;
        }

    }

    public boolean IsAncestorOf(Instance Descendant){
        return false;

        //TODO
    }

    public boolean IsDescendantOf(Instance Ancestor){
        return false;

        //TODO
    }

    public Instance WaitForChild(String childName, float timeOut){
        return null;

        //TODO
    } 



    /*
    * public Actor GetActor() is a lua-only due to actors
    * It goes in between FindFirstDescendant and GetAttribute
    */

    /*
     * public Variant GetAttribute() is not implemented due to no
     * attributes
     * It goes in between GetActor and GetAttributeChangedSignal
     */

    /*
     * GetAttributeChangedSignal; GetAttributes are not implemented
     */

    /*
    * No Set attribute*/

}