package Slinkedlist;
public class node {
    protected int data ;
    protected node link ;
    
    public node(){
        link = null;
        data = 0;
    }
    public node(int d, node e){
        data = d;
        link = e;
    }
    public void SetLink(node e){
        link = e;
    }
    public void SetData(int d){
        data = d;
    }
    public node GetLink(){
        return link ;
    }
    public int GetData(){
        return data;
    }
}