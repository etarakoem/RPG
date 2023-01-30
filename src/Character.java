public class Character {
    String _name;
    double _health;
    double _att;
    double _def;
    int _lvl;
    
    public Character(String name, double health, double att, double def, int lvl){
        _name = name;
        _health = health;
        _att = att;
        _def = def;
        _lvl = lvl;
    }

    public void setName (String name){
        _name = name;
    }
    public void setHealth (double health){
        _health = health;
    }
    public void setAtt ( double att){
        _att = att;
    }
    public void setDef(double def){
        _def = def;
    }
    public void setLevel(int lvl ){
        _lvl = lvl;
    }

    public String getName(){
        return _name;
    }
    public double getHealth(){
        return _health;
    }
    public double getAtt(){
        return _att;
    }
    public double getDef(){
        return _def;
    }
    public int getLvl(){
        return _lvl;
    }

    public void hitHealth( double health ){
        _health = _health - health;

    }
    public void heal( double heal){
        _health = _health + heal;
    }
    public void attUp(double amount){
        _att = _att + amount;
    }
    public void attDown(double amount){
        _att = _att - amount;
    }
 
    public String toString(){
        return "Name: "+_name+"\nHealth: "+_health+"\nAttack damage: "+_att+"\nDefend: "+_def+"\nLevel: "+_lvl;
    }

}
