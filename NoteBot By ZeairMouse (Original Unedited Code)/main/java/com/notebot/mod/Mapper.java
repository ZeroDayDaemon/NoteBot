package com.notebot.mod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.vecmath.Vector3d;
import java.awt.*;

/**
 * Created by Victor on 7/14/2015.
 */
@SideOnly(Side.CLIENT)
public class Mapper
{
    private static Instrument inst1, inst2, inst3, inst4, inst5;

    public static void Unmap()
    {
        inst1 = null;
        inst2 = null;
        inst3 = null;
        inst4 = null;
        inst5 = null;
    }

    public static Instrument GetInstrument(int inst)
    {
        switch(inst)
        {
            case 1:
                return inst1;
            case 2:
                return inst2;
            case 3:
                return inst3;
            case 4:
                return inst4;
            case 5:
                return inst5;
        }

        return null;
    }


    public static Color GetInstrumentColor(int inst)
    {
        switch(inst)
        {
            case 1:
                return new Color(188, 152, 98);
            case 2:
                return new Color(127, 127, 127);
            case 3:
                return new Color(255, 230, 150);
            case 4:
                return new Color(255, 255, 255);
            case 5:
                return new Color(108, 164, 93);
        }

        return null;
    }

    private static BlockPos GetPosition(BlockPos center, int forward, int left)
    {
        double cx = center.getX();
        double cy = center.getY();
        double cz = center.getZ();

        EnumFacing facing = Minecraft.getMinecraft().thePlayer.getHorizontalFacing();

        Vector3d forwardv = new Vector3d(0, 0 ,0);
        Vector3d leftv = new Vector3d(0, 0 ,0);

        switch(facing)
        {
        case NORTH:
            forwardv.z = -1;
            leftv.x = -1;
            break;
        case EAST:
            forwardv.x = 1;
            leftv.z = -1;
            break;
        case SOUTH:
            forwardv.z = 1;
            leftv.x = 1;
            break;
        case WEST:
            forwardv.x = -1;
            leftv.z = 1;
            break;
        }

        double forwardx = forwardv.x*forward;
        double forwardz = forwardv.z*forward;
        double leftx = leftv.x*left;
        double leftz = leftv.z*left;

        return new BlockPos(cx + forwardx + leftx, cy, cz + forwardz + leftz);
    }

    public static void MapInstrument1()
    {
        EntityPlayerSP ply = Minecraft.getMinecraft().thePlayer;
        BlockPos center = new BlockPos(ply.posX, (int)ply.posY, ply.posZ);

        inst1 = new Instrument(1);
        int curpitch = 0;

        inst1.AddNote(curpitch++, GetPosition(center, 5, 2));

        inst1.AddNote(curpitch++, GetPosition(center, 4, 3));
        inst1.AddNote(curpitch++, GetPosition(center, 3, 4));

        inst1.AddNote(curpitch++, GetPosition(center, 2, 5));
        inst1.AddNote(curpitch++, GetPosition(center, 1, 5));
        inst1.AddNote(curpitch++, GetPosition(center, 0, 5));
        inst1.AddNote(curpitch++, GetPosition(center, -1, 5));
        inst1.AddNote(curpitch++, GetPosition(center, -2, 5));

        inst1.AddNote(curpitch++, GetPosition(center, -3, 4));
        inst1.AddNote(curpitch++, GetPosition(center, -4, 3));

        inst1.AddNote(curpitch++, GetPosition(center, -5, 2));
        inst1.AddNote(curpitch++, GetPosition(center, -5, 1));
        inst1.AddNote(curpitch++, GetPosition(center, -5, 0));
        inst1.AddNote(curpitch++, GetPosition(center, -5, -1));
        inst1.AddNote(curpitch++, GetPosition(center, -5, -2));

        inst1.AddNote(curpitch++, GetPosition(center, -4, -3));
        inst1.AddNote(curpitch++, GetPosition(center, -3, -4));

        inst1.AddNote(curpitch++, GetPosition(center, -2, -5));
        inst1.AddNote(curpitch++, GetPosition(center, -1, -5));
        inst1.AddNote(curpitch++, GetPosition(center, -0, -5));
        inst1.AddNote(curpitch++, GetPosition(center, 1, -5));
        inst1.AddNote(curpitch++, GetPosition(center, 2, -5));

        inst1.AddNote(curpitch++, GetPosition(center, 3, -4));
        inst1.AddNote(curpitch++, GetPosition(center, 4, -3));

        inst1.AddNote(curpitch++, GetPosition(center, 5, -2));
    }

    public static void MapInstrument2()
    {
        EntityPlayerSP ply = Minecraft.getMinecraft().thePlayer;
        BlockPos center = new BlockPos(ply.posX, (int)ply.posY, ply.posZ);

        inst2 = new Instrument(2);
        int curpitch = 0;

        inst2.AddNote(curpitch++, GetPosition(center, 5, 1));

        inst2.AddNote(curpitch++, GetPosition(center, 4, 1).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 4, 2).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, 3, 3).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, 2, 4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 1, 4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 0, 4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -1, 4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -2, 4).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, -3, 3).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, -4, 2).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -4, 1).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -4, 0).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -4, -1).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -4, -2).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, -3, -3).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, -2, -4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, -1, -4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 0, -4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 1, -4).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 2, -4).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, 3, -3).add(0, -1, 0));

        inst2.AddNote(curpitch++, GetPosition(center, 4, -2).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 4, -1).add(0, -1, 0));
        inst2.AddNote(curpitch++, GetPosition(center, 4, -0).add(0, -1, 0));
    }

    public static void MapInstrument3()
    {
        EntityPlayerSP ply = Minecraft.getMinecraft().thePlayer;
        BlockPos center = new BlockPos(ply.posX, (int)ply.posY, ply.posZ);

        inst3 = new Instrument(3);
        int curpitch = 0;

        inst3.AddNote(curpitch++, GetPosition(center, 5, -1));

        inst3.AddNote(curpitch++, GetPosition(center, 3, 1).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 3, 2).add(0, -1, 0));

        inst3.AddNote(curpitch++, GetPosition(center, 2, 3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 1, 3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 0, 3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 0, 2).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -1, 3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -2, 3).add(0, -1, 0));

        inst3.AddNote(curpitch++, GetPosition(center, -3, 2).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -3, 1).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -3, 0).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -2, 0).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -3, -1).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -3, -2).add(0, -1, 0));

        inst3.AddNote(curpitch++, GetPosition(center, -2, -3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, -1, -3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 0, -3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 0, -2).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 1, -3).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 2, -3).add(0, -1, 0));

        inst3.AddNote(curpitch++, GetPosition(center, 3, -2).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 3, -1).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 3, 0).add(0, -1, 0));
        inst3.AddNote(curpitch++, GetPosition(center, 2, 0).add(0, -1, 0));
    }

    public static void MapInstrument4()
    {
        EntityPlayerSP ply = Minecraft.getMinecraft().thePlayer;
        BlockPos center = new BlockPos(ply.posX, (int)ply.posY, ply.posZ);

        inst4 = new Instrument(4);
        int curpitch = 0;

        inst4.AddNote(curpitch++, GetPosition(center, 5, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 2, 1).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 2, 2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 1, 2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 1, 1).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 0, 1).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, -1, 1).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -1, 2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -2, 2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -2, 1).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, -1, 0).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, -1, -1).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -2, -1).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -2, -2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -1, -2).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 0, -1).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 1, -1).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 1, -2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 2, -2).add(0, -1, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 2, -1).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 1, 0).add(0, -1, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 0, 1).add(0, 3, 0));
        inst4.AddNote(curpitch++, GetPosition(center, 0, -1).add(0, 3, 0));
        inst4.AddNote(curpitch++, GetPosition(center, -1, 0).add(0, 3, 0));

        inst4.AddNote(curpitch++, GetPosition(center, 0, 0).add(0, -1, 0));
    }

    public static void MapInstrument5()
    {
        EntityPlayerSP ply = Minecraft.getMinecraft().thePlayer;
        BlockPos center = new BlockPos(ply.posX, (int)ply.posY, ply.posZ);

        inst5 = new Instrument(5);
        int curpitch = 0;

        inst5.AddNote(curpitch++, GetPosition(center, 5, 2).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, 4, 3).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 3, 4).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, 2, 5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 1, 5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 0, 5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -1, 5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -2, 5).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, -3, 4).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -4, 3).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, -5, 2).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -5, 1).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -5, 0).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -5, -1).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -5, -2).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, -4, -3).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -3, -4).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, -2, -5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -1, -5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, -0, -5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 1, -5).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 2, -5).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, 3, -4).add(0, 2, 0));
        inst5.AddNote(curpitch++, GetPosition(center, 4, -3).add(0, 2, 0));

        inst5.AddNote(curpitch++, GetPosition(center, 5, -2).add(0, 2, 0));
    }
}
