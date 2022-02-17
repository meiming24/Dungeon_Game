package dungeoncrawler.game;

import dungeoncrawler.framework.utils.MathHelper;
import dungeoncrawler.game.world.generator.RoomData;

public class Init {
	
	public static final RoomData[] ROOMS = new RoomData[] {
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1},
									   {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.NORTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 1, 1},
									   {1, 0, 0, 0, 0, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 4, 4, 4, 4, 4, 0, 0, 0, 0, 1, 1},
									   {1, 1, 1, 0, 0, 0, 4, 4, 0, 0, 1, 0, 0, 0, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.SOUTH),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 2},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}},
					MathHelper.Direction.WEST),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
									   {2, 0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {2, 0, 2, 0, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {2, 0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
									   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}},
					MathHelper.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 0, 2, 0, 2, 0, 3, 3, 0, 2, 0, 2, 0, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 0, 2, 0, 2, 0, 3, 3, 0, 2, 0, 2, 0, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 1},
									   {1, 1, 1, 1, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.NORTH, MathHelper.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 0, 0, 1, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0},
									   {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0},
									   {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0},
									   {1, 1, 1, 0, 0, 0, 4, 4, 4, 4, 0, 0, 1, 0, 0, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.WEST, MathHelper.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 2, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 1, 1, 1, 0, 0, 0, 0, 0, 1},
									   {1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.NORTH, MathHelper.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
									   {1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.NORTH, MathHelper.Direction.WEST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 2, 3, 3, 3, 2, 0, 0, 0, 0, 4, 4, 0, 0, 0, 1},
									   {1, 2, 3, 3, 3, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 2, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0},
									   {1, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.SOUTH, MathHelper.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 1},
									   {1, 2, 0, 0, 0, 0, 0, 2, 0, 2, 2, 2, 2, 0, 2, 2},
									   {0, 0, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2},
									   {0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2},
									   {0, 0, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2, 0, 0, 0, 2},
									   {1, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 2, 0, 2, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 2, 2, 2, 1, 1}},
					MathHelper.Direction.SOUTH, MathHelper.Direction.WEST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.NORTH, MathHelper.Direction.EAST, MathHelper.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 2, 0, 1},
									   {0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 1, 0, 0, 3, 0, 0},
									   {0, 0, 0, 0, 0, 2, 0, 2, 1, 1, 0, 0, 0, 3, 0, 0},
									   {0, 0, 0, 1, 1, 0, 0, 2, 2, 2, 0, 0, 1, 1, 0, 0},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 4, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.WEST, MathHelper.Direction.EAST, MathHelper.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 1},
									   {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 1},
									   {1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.WEST, MathHelper.Direction.NORTH, MathHelper.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
									   {1, 0, 4, 1, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 0, 1},
									   {0, 0, 4, 4, 4, 4, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0},
									   {0, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 4, 0, 1, 0, 0},
									   {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0},
									   {1, 0, 1, 0, 0, 0, 4, 4, 1, 4, 4, 4, 4, 0, 0, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathHelper.Direction.WEST, MathHelper.Direction.NORTH, MathHelper.Direction.EAST),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2},
									   {0, 0, 3, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 3, 0, 0},
									   {0, 0, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 0, 0},
									   {0, 0, 3, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 3, 0, 0},
									   {2, 0, 2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2}},
					MathHelper.Direction.NORTH, MathHelper.Direction.SOUTH, MathHelper.Direction.WEST, MathHelper.Direction.EAST),
	};
	
}
