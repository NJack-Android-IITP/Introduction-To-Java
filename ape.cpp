#include <iostream>
using namespace std;
 
class ape{
	private:
	int hands;
	int legs;
 
	public:
 
	/*ape() {
		hands = 2;
		legs = 2;
	}
 */
	int getHands() {
		return hands;
	}
 
	int getLegs() {
		return legs;
	}

	void setHands(int h) {
		if(h>=0 && h<=2)
		hands = h;
	}
 
	void setLegs(int l) {
		if(l>=0 && l<=2)
		legs = l;
	}
 
	
};
 
 
 
int main() {
	ape a;
	cout<<a.getHands()<<"\n";

	a.setHands(1);
	cout<<a.getHands()<<"\n";
	a.setHands(3);
	cout<<a.getHands()<<"\n";

	return 0;
}