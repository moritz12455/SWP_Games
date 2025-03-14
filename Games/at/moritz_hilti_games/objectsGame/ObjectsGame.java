package at.moritz_hilti_games.objectsGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {

    public ObjectsGame(String title) {
        super(title);
    }

    private List<Rectangle> rectangles;
    private List<Circle> circles;
    private List<Eclipse> eclipses;


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new ArrayList<>();
        this.circles = new LinkedList<>();
        this.eclipses = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Rectangle  rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
            rectangles.add(rectangle);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            this.circles.add(circle);

        }

        for (int i = 0; i < 10; i++) {
            Eclipse eclipse = new Eclipse();
            this.eclipses.add(eclipse);
        }




    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle:this.rectangles) {
            rectangle.update(delta);
        }

        for (Circle circle:this.circles) {
            circle.update(delta);
        }

        for (Eclipse eclipse:this.eclipses) {
            eclipse.update(delta);
        }




    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle:this.rectangles) {
            rectangle.render(graphics);
        }

        for (Circle circle:this.circles) {
            circle.render(graphics);
        }

        for (Eclipse eclipse:this.eclipses) {
            eclipse.render(graphics);
        }

    }




    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Objects Game"));
            container.setDisplayMode(1000,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
