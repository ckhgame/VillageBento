package com.ckhgame.villagebento.ai.villager;

import com.ckhgame.villagebento.config.ConfigVillager;
import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.util.VillageTime;

import net.minecraft.entity.ai.EntityAIBase;

public class VillagerAISleep extends EntityAIBase
{
    private EntityVBVillager entity;

    public VillagerAISleep(EntityVBVillager entity)
    {
        this.entity = entity;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
    	//sleep only at late night
    	if(!VillageTime.isLateNight(this.entity.worldObj))
    		return false;
    	
    	//if the one has already been sleeping, just let it keep sleeping... 
    	if(this.entity.getSleeping())
    		return true;
    	else{
    		//if now it's not sleeping, we need to move it to the bed 
    		if(entity.bedPosition==null)
    			return false;
    		else
    			return true;
    		
    	}    	
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
    	 if (this.entity.getRNG().nextInt(60) != 0){
             return true;
         }
    	 else{    		 
    		 return (VillageTime.isLateNight(this.entity.worldObj) && this.entity.isNearBed());
    	 }
        
    }

	public void updateTask() {
		if(!this.entity.getSleeping() && this.entity.isNearBed()){
			this.entity.setSleeping(true);
		}
	}
    
    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    	if(!this.entity.getSleeping()){
    		this.entity.getNavigator().tryMoveToXYZ(this.entity.bedPosition.xCoord + 0.5D,
								    				this.entity.bedPosition.yCoord + 1.0D,
								    				this.entity.bedPosition.zCoord + 0.5D,
								    				ConfigVillager.VillagerMoveSpeed);
    	}
    }

	@Override
	public void resetTask() {
		this.entity.setSleeping(false);
	}
    
    
}