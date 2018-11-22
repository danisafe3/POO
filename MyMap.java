package myguiproject;

import java.awt.Graphics;
import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World mundo;

    /**
     * Creates new form MyMap
     */
    public MyMap() {
        initComponents();
        setSize(800, 600);
        
        LinkedList<Continent> continents = new LinkedList<>();
        continents = newLand();
        
        LinkedList<Ocean> oceans = new LinkedList<>();
        oceans = newWater();

        mundo = new World(continents, oceans);
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        mundo.draw(g, 10, 10);
    }
    
    public LinkedList<Ocean> newWater(){
        
        LinkedList<Point> ocean1Points = new LinkedList<>();
        ocean1Points.add(new Point(0, 0));
        ocean1Points.add(new Point(0, 240));
        ocean1Points.add(new Point(80, 240));
        ocean1Points.add(new Point(80, 160));
        ocean1Points.add(new Point(120, 80));
        ocean1Points.add(new Point(320, 40));
        ocean1Points.add(new Point(400, 80));
        ocean1Points.add(new Point(480, 0));
        Ocean ocean1 = new Ocean("Pacífico", ocean1Points);
        LinkedList<Ocean> oceans = new LinkedList<>();
        oceans.add(ocean1);
        System.out.println("Added Ocean");

        LinkedList<Point> ocean2Points = new LinkedList<>();
        ocean2Points.add(new Point(0, 240));
        ocean2Points.add(new Point(0, 580));
        ocean2Points.add(new Point(780, 580));
        ocean2Points.add(new Point(780, 0));
        ocean2Points.add(new Point(480, 0));
        ocean2Points.add(new Point(544, 96));
        ocean2Points.add(new Point(480, 80));
        ocean2Points.add(new Point(456, 104));
        ocean2Points.add(new Point(480, 160));
        ocean2Points.add(new Point(560, 232));
        ocean2Points.add(new Point(480, 360));
        ocean2Points.add(new Point(360, 440));
        ocean2Points.add(new Point(240, 400));
        ocean2Points.add(new Point(160, 280));
        ocean2Points.add(new Point(80, 240));
        Ocean ocean2 = new Ocean("Atlantico", ocean2Points);
        oceans.add(ocean2);
        System.out.println("Added Ocean");
        
        LinkedList<Point> ocean3Points = new LinkedList<>();
        ocean3Points.add(new Point(160, 280));
        ocean3Points.add(new Point(240, 400));
        ocean3Points.add(new Point(320, 240));
        ocean3Points.add(new Point(440, 256));
        ocean3Points.add(new Point(560, 232));
        ocean3Points.add(new Point(480, 160));
        ocean3Points.add(new Point(352, 176));
        ocean3Points.add(new Point(320, 160));
        
        Ocean ocean3 = new Ocean("Indico", ocean3Points);
        oceans.add(ocean3);
        System.out.println("Added Ocean");
        return oceans;
    }
    
    public LinkedList<Continent> newLand(){
        
        LinkedList<Point> points1 = new LinkedList<>();
        points1.add(new Point(480, 0));
        points1.add(new Point(400, 80));
        points1.add(new Point(480, 160));
        points1.add(new Point(456, 104));
        points1.add(new Point(480, 80));
        points1.add(new Point(544, 96));
        LinkedList<City> cities1 = new LinkedList<>();
        City c1 = new City(480, 40, "Madrid", 3100000);
        cities1.add(c1);
        cities1.add(new City(440, 72, "Barcelona", 1600000));
        Country country1 = new Country(points1, "España", cities1, c1);
        System.out.println("Added Country");
        
        LinkedList<Point> points2 = new LinkedList<>();
        points2.add(new Point(320, 40));
        points2.add(new Point(120, 80));
        points2.add(new Point(264, 72));
        points2.add(new Point(320, 160));
        points2.add(new Point(352, 176));
        points2.add(new Point(480, 160));
        points2.add(new Point(400, 80));
        LinkedList<City> cities2 = new LinkedList<>();
        City c2 = new City(400, 136, "Lisboa", 504000);
        cities2.add(c2);
        cities2.add(new City(320, 80, "Oporto", 214000));
        Country country2 = new Country(points2, "Portugal", cities2, c2);
        System.out.println("Added Country");
        
        LinkedList<Point> points3 = new LinkedList<>();
        points3.add(new Point(120, 80));
        points3.add(new Point(160, 160));
        points3.add(new Point(320, 160));
        points3.add(new Point(264, 72));
        LinkedList<City> cities3 = new LinkedList<>();
        City c3 = new City(160, 96, "Roma", 2800000);
        cities3.add(c3);
        cities3.add(new City(240, 136, "Florencia", 382000));
        Country country3 = new Country(points3, "Italia", cities3, c3);
        System.out.println("Added Country");
        
        LinkedList<Point> points4 = new LinkedList<>();
        points4.add(new Point(120, 80));
        points4.add(new Point(80, 160));
        points4.add(new Point(80, 240));
        points4.add(new Point(160, 280));
        points4.add(new Point(320, 160));
        points4.add(new Point(160, 160));
        LinkedList<City> cities4 = new LinkedList<>();
        City c4 = new City(160, 200, "Paris", 2200000);
        cities4.add(c4);
        cities4.add(new City(240, 176, "Toulouse", 466000));
        Country country4 = new Country(points4, "Francia", cities4, c4);
        System.out.println("Added Country");
        
        LinkedList<Lake> lakes1 = new LinkedList<>();
        
        Lake l1 = new Lake(new Point(296, 120), 16, 48, "Lago Ness");
        lakes1.add(l1);
        System.out.println("Added Lake");
        
        LinkedList<PolygonalRegion> countries1 = new LinkedList<>();
        countries1.add(country1);
        countries1.add(country2);
        countries1.add(country3);
        countries1.add(country4);
        Continent continent1 = new Continent("Continent1", countries1, lakes1);
        
        LinkedList<Point> points5 = new LinkedList<>();
        points5.add(new Point(560, 232));
        points5.add(new Point(440, 256));
        points5.add(new Point(400, 320));
        points5.add(new Point(480, 360));
        LinkedList<City> cities5 = new LinkedList<>();
        City c5 = new City(480, 320, "Manila", 1780000);
        cities5.add(c5);
        Country country5 = new Country(points5, "Filipinas", cities5, c5);
        System.out.println("Added Country");

        
        LinkedList<Point> points6 = new LinkedList<>();
        points6.add(new Point(320, 240));
        points6.add(new Point(240, 400));
        points6.add(new Point(360, 440));
        points6.add(new Point(480, 360));
        points6.add(new Point(400, 320));
        points6.add(new Point(440, 256));
        LinkedList<City> cities6 = new LinkedList<>();
        City c6 = new City(360, 360, "P.Moresby", 364000);
        cities6.add(c6);
        cities6.add(new City(320, 320, "Lae", 100677));
        cities6.add(new City(400, 400, "Arawa", 40260));
        Country country6 = new Country(points6, "Papua Nueva Guinea", cities6, c6);
        System.out.println("Added Country");

        LinkedList<Lake> lakes2 = new LinkedList<>();
        Lake l2 = new Lake(new Point(344, 264), 64, 40, "Hakuna Matata");
        lakes1.add(l2);
        System.out.println("Added Lake");
        
        LinkedList<PolygonalRegion> countries2 = new LinkedList<>();
        countries2.add(country5);
        countries2.add(country6);
        Continent continent2 = new Continent("Continent2", countries2, lakes2);
        
        LinkedList<Continent> continents = new LinkedList<>();
        continents.add(continent1);
        continents.add(continent2);
        System.out.println("Added Continents");
        System.out.println();
        
        return continents;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
