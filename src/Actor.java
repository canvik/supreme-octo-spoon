/**this class will create a character with 
 * the capability to be displayed to the screen
 * as well as keep track of the weapon currently equipped
 * 
 * @author Troy Passingham
 * @version May 27 2016
 *
 */
import java.awt.*;
import java.io.*;
import javax.swing.ImageIcon;

public class Actor {
	//Declare variables and objects
	private int x, y, maxHp, currentHp, baseSpeed = 0;
	private ImageIcon currentImage;
	private ImageIcon[] currentAnimation;
	private String file;
	private boolean invincible = false;
	private Rectangle hitBox;
	private Thread animate;
	//private Weapon currentWeapon
	
	//CONSTRUCTOR
	public Actor(String file) throws IOException{
		BufferedReader loadCharacter = new BufferedReader(new FileReader(file + ".txt"));
		this.x = Integer.valueOf(loadCharacter.readLine());
		this.y = Integer.valueOf(loadCharacter.readLine());
		this.file = file;
		this.maxHp = Integer.valueOf(loadCharacter.readLine());
		this.currentHp = maxHp;
		this.baseSpeed = Integer.valueOf(loadCharacter.readLine());
		this.hitBox = new Rectangle(x, y, Integer.valueOf(loadCharacter.readLine()), Integer.valueOf(loadCharacter.readLine()));
		currentImage = new ImageIcon(file + "stand.jpg");
		//currentWeapon = new Weapon(loadCharacter.readLine());
	}//End of constructor
	
	//METHODS
	
	//Method to check if the actor has sustained enough damage to die
	public boolean isDead(){
		boolean dead;
		if(currentHp <= 0){
			dead = true;
		}
		else{
			dead = false;
		}
		return dead;
	}// End of isDead()
	
	
	public void move(String direction, int speed){
		
	}
	public void jump(){
		
	}
	private void takeDamage(int damage){
		this.currentHp-=damage;
	}//End of takeDamage()
	private void heal(int amountHealed){
		while(currentHp < maxHp && amountHealed > 0){
			currentHp++;
			amountHealed--;
		}//End of while loop
	}//End of heal()
	private void dealDamage(String target, int damage){
		
		
	}
	private boolean isOnGround(Obstacle[] ground){
		boolean onGround = false;
		for(int i = 0; i < ground.length; i++){
			if(hitBox.intersects(ground[i].getHitBox())){
				onGround = true;
			}
		}
		return onGround;
	}//End of isOnGround()
	
	public void crouch(){
		y-=10;
		hitBox.y = y;
		hitBox.height+=10;
		while()
		animateCrouch();
	}
	public void displayActor(){
		
	}
	public void displayHealth(){
		
	}
	public void roll(){
		
	}
	public void attack(){
		
	}
	private void animateMoveRight(int speed){
		
	}
	private void animateMoveLeft(int speed){
		
	}
	private void animateJump(){
		
	}
	private void animateFalling(){
		
	}
	private void animateAttack(){
		
	}
	private void animateBlock(){
		
	}
	private void animateRoll(){
		
	}
	private void animateCrouch(){
		
	}
	
	private boolean attackBlocked(){
		
	}
	public boolean canBeHit(){
		
	}
	
	
}

