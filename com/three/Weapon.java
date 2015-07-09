package com.three;

public abstract class Weapon implements Assaultable,Mobile{
	public abstract void attack();
    public abstract void move();
//为什么move()在前面没有声明是公有类型的，而抽象类里面却是公有类型才不报错呢？
}
