package com.ckhgame.villagebento.util.village;

import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * 
 * @author ckhgame
 * === Heads up!! =====
 * = VB Time =
 * The village bento time is NOT the original Minecraft time.
 * Minecraft has 24000 ticks per day, and each 1000 ticks indicates 1 hour which is under the common sense
 * However, 0:00 AM in Minecraft is when the sun is rising, which is usually 4:00 - 6:00 AM in real world.
 * So VillageBento fixed Minecraft time by adding 6 hours forward to make it feel more real.
 * In other words, 6:00AM in VB is actually 0 tick in MC, 1:00PM in VB is 7000 ticks in MC
 * 
 * = VB Data =
 * Like the real world, VB has 7 days per week from Monday to Sunday. (Sunday is not the first day of a week here :P)
 * The earliest moment in VB is Monday 6:00 PM (0 tick in MC)
 */
public class VBDateTime {
	
	
	private static World world = null;
	private static long lastRefreshedTick = 0;
	private static int hour;
	private static int dayInWeek;
	private static int week;
	private static int minites;
	
	public static void init(World w){
		if(w.provider.dimensionId == 0){
			world = w;
		}
	}
	
	private static void refreshTick(){
		long currentTick = world.getWorldTime();
		//prevent from multiple refreshing for the tick
		if(currentTick != lastRefreshedTick){
			//refresh
			long t = currentTick + 6000; // + 6 hours to fit real world time
			hour = (int)((t % 24000) / 1000);
			int days = (int)(t / 24000);
			dayInWeek = days % 7;
			week = (int)(days / 7);
			minites = (int)((currentTick % 1000) / 16.667D);
			lastRefreshedTick = currentTick;
		}
	}
	
	public static boolean isDayTime(){
		refreshTick();
		return (hour >= 6 && hour < 18);
	}
	
	public static boolean isEarlyNight(){
		refreshTick();
		return (hour >= 18 && hour < 22);
	}
	
	public static boolean isLateNight(){
		refreshTick();
		return (hour >= 22 && hour < 24 || hour < 6);
	}
	
	public static boolean isMorning(){
		refreshTick();
		return (hour >=6 && hour < 12);
	}
	
	public static boolean isAfternoon(){
		refreshTick();
		return (hour >= 12 && hour < 18);
	}
		
	public static int getHourOfDay(){
		refreshTick();
		return hour;
	}
	
	public static int getDayInWeek(){
		refreshTick();
		return dayInWeek;
	}
	
	public static int getWeekTotal(){
		refreshTick();
		return week;
	}
	
	public static int getMinites(){
		return minites;
	}
	
	public static String getDataTimeString(){
		refreshTick();
		String[] weekdays = StatCollector.translateToLocal("villagebento.misc.dateTimeWeekdays").split(",");
		String day = weekdays[dayInWeek];
		
		int h12 = hour%12;
		if(h12 == 0) h12 = 12;
		
		String hour12 = String.format("%02d:%02d%s", h12, 10 * (minites/10), hour >= 12?"PM":"AM");
		
		return String.format(StatCollector.translateToLocal("villagebento.misc.dateTimeFormat"), week + 1,day,hour12);
	}
}