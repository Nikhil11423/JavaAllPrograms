class InnerClassRunner
{

public static void main(String[] args)
{
	    OuterClass myOuter =new OuterClass();
        OuterClass.InnerClass myInnner=myOuter.new InnerClass();
		
		System.out.println(myInner.y + myOuter.x);

}

}