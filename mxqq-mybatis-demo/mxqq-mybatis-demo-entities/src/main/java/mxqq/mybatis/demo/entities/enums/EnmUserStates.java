package mxqq.mybatis.demo.entities.enums;

public enum  EnmUserStates {
    None(0),
    Enable(1),
    Disable(21),
    Removed(31);

    private int value=0;
    EnmUserStates(int i){
        this.value=i;
    }
    public int getValue(){
        return this.value;
    }
}
