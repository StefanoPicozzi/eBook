package com.redhat.weightwatcher;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GoalScore implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("User ID")
   private int userid;
   @org.kie.api.definition.type.Label("Goal Name")
   private java.lang.String goalname;
   @org.kie.api.definition.type.Label("Score")
   private int score;
   @org.kie.api.definition.type.Label("Low")
   private int low;
   @org.kie.api.definition.type.Label("High")
   private int high;
   @org.kie.api.definition.type.Label(value = "Program ID")
   private int programid;

   public GoalScore()
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

   public int getScore()
   {
      return this.score;
   }

   public void setScore(int score)
   {
      this.score = score;
   }

   public int getLow()
   {
      return this.low;
   }

   public void setLow(int low)
   {
      this.low = low;
   }

   public int getHigh()
   {
      return this.high;
   }

   public void setHigh(int high)
   {
      this.high = high;
   }

   public java.lang.String getGoalname()
   {
      return this.goalname;
   }

   public void setGoalname(java.lang.String goalname)
   {
      this.goalname = goalname;
   }

   public int getProgramid()
   {
      return this.programid;
   }

   public void setProgramid(int programid)
   {
      this.programid = programid;
   }

   public GoalScore(int programid, int userid, java.lang.String goalname, int score, int low,
         int high )
   {
      this.userid = userid;
      this.goalname = goalname;
      this.score = score;
      this.low = low;
      this.high = high;
      this.programid = programid;
   }

}
