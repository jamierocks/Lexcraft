package lexware.lexcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
			case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}

	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	private void generateOverworld(World world, Random random, int x, int z) {
		this.addOreSpawn(Lexcraft.pinkCrystalOre, world, random, x, z, 16, 16, 7 + random.nextInt(3), 6, 15, 50);
		this.addOreSpawn(Lexcraft.purpleCrystalOre, world, random, x, z, 16, 16, 7 + random.nextInt(3), 6, 15, 50);
		this.addOreSpawn(Lexcraft.rubyOre, world, random, x, z, 16, 16, 9 + random.nextInt(3), 7, 15, 50);
		this.addOreSpawn(Lexcraft.sapphireOre, world, random, x, z, 16, 16, 9 + random.nextInt(3), 7, 15, 50);
		this.addOreSpawn(Block.oreEmerald, world, random, x, z, 16, 16, 9 + random.nextInt(3), 7, 15, 50);
		this.addOreSpawn(Lexcraft.orangeCrystalOre, world, random, x, z, 16, 16, 7 + random.nextInt(3), 6, 15, 50);
		this.addOreSpawn(Lexcraft.clearCrystalOre, world, random, x, z, 16, 16, 8 + random.nextInt(3), 8, 15, 50);
		this.addOreSpawn(Block.blockClay, world, random, x, z, 16, 16, 8 + random.nextInt(3), 6, 15, 50);
	}

	private void generateNether(World world, Random random, int x, int z) {
		
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

}
