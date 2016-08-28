package com.redhat.weightwatcher;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GAS implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("User ID")
   private int userid;
   @org.kie.api.definition.type.Label("Goal Name")
   private java.lang.String goalname;
   @org.kie.api.definition.type.Label("Best High")
   private int besthi;

   @org.kie.api.definition.type.Label("Best Low")
   private int bestlo;

   @org.kie.api.definition.type.Label("More Low")
   private int morelo;

   @org.kie.api.definition.type.Label("More High")
   private int morehi;

   @org.kie.api.definition.type.Label("Expected Low")
   private int explo;

   @org.kie.api.definition.type.Label("Expected High")
   private int exphi;

   @org.kie.api.definition.type.Label("Less Low")
   private int lesslo;

   @org.kie.api.definition.type.Label("Less High")
   private int lesshi;

   @org.kie.api.definition.type.Label("Worst Low")
   private int worstlo;

   @org.kie.api.definition.type.Label("Worst High")
   private int worsthi;

   @org.kie.api.definition.type.Label(value = "Program ID")
   private int programid;

   public GAS()
   {
   }

   public int getUserid()
   {
      return this.userid;
   }

   public void setUserid(int userid)
   {
      this.userid = userid;
   }

   public java.lang.String getGoalname()
   {
      return this.goalname;
   }

   public void setGoalname(java.lang.String goalname)
   {
      this.goalname = goalname;
   }

   public int getBesthi()
   {
      return this.besthi;
   }

   public void setBesthi(int besthi)
   {
      this.besthi = besthi;
   }

   public int getBestlo()
   {
      return this.bestlo;
   }

   public void setBestlo(int bestlo)
   {
      this.bestlo = bestlo;
   }

   public int getMorelo()
   {
      return this.morelo;
   }

   public void setMorelo(int morelo)
   {
      this.morelo = morelo;
   }

   public int getMorehi()
   {
      return this.morehi;
   }

   public void setMorehi(int morehi)
   {
      this.morehi = morehi;
   }

   public int getExplo()
   {
      return this.explo;
   }

   public void setExplo(int explo)
   {
      this.explo = explo;
   }

   public int getExphi()
   {
      return this.exphi;
   }

   public void setExphi(int exphi)
   {
      this.exphi = exphi;
   }

   public int getLesslo()
   {
      return this.lesslo;
   }

   public void setLesslo(int lesslo)
   {
      this.lesslo = lesslo;
   }

   public int getLesshi()
   {
      return this.lesshi;
   }

   public void setLesshi(int lesshi)
   {
      this.lesshi = lesshi;
   }

   public int getWorstlo()
   {
      return this.worstlo;
   }

   public void setWorstlo(int worstlo)
   {
      this.worstlo = worstlo;
   }

   public int getWorsthi()
   {
      return this.worsthi;
   }

   public void setWorsthi(int worsthi)
   {
      this.worsthi = worsthi;
   }

   public int getProgramid()
   {
      return this.programid;
   }

   public void setProgramid(int programid)
   {
      this.programid = programid;
   }

   public GAS(int programid, int userid, java.lang.String goalname, int besthi, int bestlo,
         int morelo, int morehi, int explo, int exphi, int lesslo, int lesshi,
         int worstlo, int worsthi)
   {
      this.userid = userid;
      this.goalname = goalname;
      this.besthi = besthi;
      this.bestlo = bestlo;
      this.morelo = morelo;
      this.morehi = morehi;
      this.explo = explo;
      this.exphi = exphi;
      this.lesslo = lesslo;
      this.lesshi = lesshi;
      this.worstlo = worstlo;
      this.worsthi = worsthi;
      this.programid = programid;
   }

}