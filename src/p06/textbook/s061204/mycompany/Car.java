package p06.textbook.s061204.mycompany;

import p06.textbook.s061204.hankook.*;
import p06.textbook.s061204.hyndai.Engine;
import p06.textbook.s061204.kumho.*;
	
public class Car {
	//필드 5개의 패키지가 다름
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//패키지 내 이름이 같으면 패키지명을 풀네임으로
	p06.textbook.s061204.hankook.Tire tire3 = new p06.textbook.s061204.hankook.Tire();
	p06.textbook.s061204.kumho.Tire tire4 = new p06.textbook.s061204.kumho.Tire();
	
}
