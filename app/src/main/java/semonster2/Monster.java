package semonster2;

public class Monster {
   String name;
   int rare;

   Monster(String name,int rare_num){
    this.name = name;
    this.rare = rare_num; 
   }

   @Override
   public String toString(){
    return this.name + ":レア度[" + this.rare + "]\n";
   } 
   
   
}
