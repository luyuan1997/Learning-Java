package petShop;

public class PetShop {

	private Pet[] pets;
	private int foot;
	public PetShop(int len) {
		//构造方法开辟宠物数据大小，如果大于零，开辟空间，否则至少开辟一个空间
		if(len > 0) {
			this.pets = new Pet[len];
		}else {
			this.pets = new Pet[1];
		}
	}
	
	public boolean add(Pet pet) {
		if(this.foot < this.pets.length) {
			//判断宠物店的宠物是否满员，增加宠物，修改保存位置
			this.pets[this.foot] = pet;
			this.foot++;
			return true;
		}else {
			return false;
		}
	}
	
	public Pet[] search(String keyWord) {
		Pet p[] = null;
		int count =0;
		for(int i=0; i<this.pets.length; i++) {
			if(this.pets[i] != null) {
				if(this.pets[i].getName().indexOf(keyWord) != -1 || this.pets[i].getColor().indexOf(keyWord)!= -1) {
					count++;
					
				}
			}
		}
		p=new Pet[count];
		int f =0;
		for(int i=0; i<this.pets.length; i++) {
			if(this.pets[i] != null) {
				if(this.pets[i].getName().indexOf(keyWord)!=-1 || this.pets[i].getColor().indexOf(keyWord) != -1) {
					p[f]=this.pets[i];
					f++;
				}
			}
		}
		return p;
		
	}
}
