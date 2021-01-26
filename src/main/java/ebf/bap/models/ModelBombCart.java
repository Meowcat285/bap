//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.05.2019 - 11:22:21
// Last changed on: 15.05.2019 - 11:22:21

package ebf.bap.models; //Path where the model is located

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBombCart extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBombCart() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 2 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 5 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 83
		bodyModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 85
		bodyModel[61] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 86
		bodyModel[62] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 89
		bodyModel[65] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 91
		bodyModel[67] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 92
		bodyModel[68] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 93
		bodyModel[69] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 96 glow
		bodyModel[72] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 97
		bodyModel[73] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 98
		bodyModel[74] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 99
		bodyModel[75] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 100
		bodyModel[76] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 101
		bodyModel[77] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 102
		bodyModel[78] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 103
		bodyModel[79] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 104
		bodyModel[80] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 105
		bodyModel[81] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 106
		bodyModel[82] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 107
		bodyModel[83] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 108
		bodyModel[84] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 109
		bodyModel[85] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 110
		bodyModel[86] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 111
		bodyModel[87] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 112
		bodyModel[88] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 113
		bodyModel[89] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 114
		bodyModel[90] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 115

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[0].setRotationPoint(-4.5F, 7F, -6F);

		bodyModel[1].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(-4F, 7.5F, -6F);

		bodyModel[2].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 2 wheel
		bodyModel[2].setRotationPoint(-4F, 7.5F, 6F);

		bodyModel[3].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(4F, 7.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
		bodyModel[4].setRotationPoint(3.5F, 7F, -6F);

		bodyModel[5].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 5 wheel
		bodyModel[5].setRotationPoint(4F, 7.5F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(-7F, 4.5F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-7F, 8F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(-7F, 8F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 9
		bodyModel[9].setRotationPoint(6F, 8F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 10
		bodyModel[10].setRotationPoint(-6F, 8F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(6F, 7F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 14
		bodyModel[12].setRotationPoint(6F, 8F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 15
		bodyModel[13].setRotationPoint(-6F, 8F, 7F);

		bodyModel[14].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 16
		bodyModel[14].setRotationPoint(-7F, 8F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 17
		bodyModel[15].setRotationPoint(-7F, 8F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 19
		bodyModel[16].setRotationPoint(-7F, 4.5F, 6F);

		bodyModel[17].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 20
		bodyModel[17].setRotationPoint(-12.5F, 4F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(-7F, 7F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-7F, 7F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(6F, 7F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-13.5F, 4F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 22
		bodyModel[22].setRotationPoint(-13.5F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-13.5F, 4F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 24
		bodyModel[24].setRotationPoint(-12.5F, 4F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(12.5F, 4F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 26
		bodyModel[26].setRotationPoint(12.5F, 4F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(12.5F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[28].setRotationPoint(-12.5F, 2F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[29].setRotationPoint(-12.5F, -0.2F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
		bodyModel[30].setRotationPoint(-12.5F, -2.4F, -7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 31
		bodyModel[31].setRotationPoint(-8.5F, -2.5F, -7.75F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 32
		bodyModel[32].setRotationPoint(-0.5F, -2.5F, -7.75F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 33
		bodyModel[33].setRotationPoint(8.5F, -2.5F, -7.75F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 34
		bodyModel[34].setRotationPoint(-12.5F, -2F, -7F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 35
		bodyModel[35].setRotationPoint(-12.5F, -2F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-12.5F, 2F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-12.5F, -0.2F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-12.5F, -2.4F, 6.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 39
		bodyModel[39].setRotationPoint(-8.5F, -2.5F, 6.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 40
		bodyModel[40].setRotationPoint(-0.5F, -2.5F, 6.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 41
		bodyModel[41].setRotationPoint(8.5F, -2.5F, 6.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 25, 1, 15, 0F); // Box 42
		bodyModel[42].setRotationPoint(-12.5F, 4F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.5F, 0.5F, -2F); // Box 43
		bodyModel[43].setRotationPoint(-12.5F, -1.5F, -7.25F);
		bodyModel[43].rotateAngleY = 0.61086524F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-12.5F, 0.4F, -7.25F);
		bodyModel[44].rotateAngleX = 0.05235988F;
		bodyModel[44].rotateAngleY = 0.4712389F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.5F, 0.5F, -3F); // Box 45
		bodyModel[45].setRotationPoint(-12.5F, 2.2F, -7.25F);
		bodyModel[45].rotateAngleX = -0.01745329F;
		bodyModel[45].rotateAngleY = 0.4712389F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(-8F, 7.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 48
		bodyModel[47].setRotationPoint(-8F, 7.5F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-8F, 7.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(-7.25F, 4.5F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(6.25F, 4.5F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(7F, 7.5F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 53
		bodyModel[52].setRotationPoint(7F, 7.5F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(7F, 7.5F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-15.5F, -1F, 2.75F);
		bodyModel[54].rotateAngleY = -0.61086524F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-15F, 0.9F, 2F);
		bodyModel[55].rotateAngleX = 0.05235988F;
		bodyModel[55].rotateAngleY = -0.41887902F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(-14.5F, 2.2F, 2.75F);
		bodyModel[56].rotateAngleX = -0.01745329F;
		bodyModel[56].rotateAngleY = -0.4712389F;

		bodyModel[57].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 79
		bodyModel[57].setRotationPoint(-10.5F, -10F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 12, 12, 0F); // Box 80
		bodyModel[58].setRotationPoint(-12.5F, -9F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 10, 10, 0F); // Box 83
		bodyModel[59].setRotationPoint(-2.5F, -8F, -5F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 85
		bodyModel[60].setRotationPoint(2.5F, -8F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 86
		bodyModel[61].setRotationPoint(2.5F, -8F, 5F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 87
		bodyModel[62].setRotationPoint(2.5F, -8F, -5F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 88
		bodyModel[63].setRotationPoint(2.5F, 3F, -5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 8, 8, 0F); // Box 89
		bodyModel[64].setRotationPoint(0.5F, -6F, -4F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 90
		bodyModel[65].setRotationPoint(3.5F, -4F, -2F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 91
		bodyModel[66].setRotationPoint(3.5F, -2.5F, -5F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 92
		bodyModel[67].setRotationPoint(3.5F, -2.5F, 2F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 93
		bodyModel[68].setRotationPoint(3.5F, 0F, -0.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 94
		bodyModel[69].setRotationPoint(3.5F, -7F, -0.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 95
		bodyModel[70].setRotationPoint(-8.5F, -11F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 96 glow
		bodyModel[71].setRotationPoint(-8.5F, -13F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 8, 11, 0F); // Box 97
		bodyModel[72].setRotationPoint(7.5F, -4F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[73].setRotationPoint(7.5F, -5F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[74].setRotationPoint(7.5F, -5F, 5F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 100
		bodyModel[75].setRotationPoint(7.5F, -5F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[76].setRotationPoint(9.5F, -11F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[77].setRotationPoint(9.5F, -17F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 103
		bodyModel[78].setRotationPoint(8.5F, -18F, 2F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 104
		bodyModel[79].setRotationPoint(9.5F, -4F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 105
		bodyModel[80].setRotationPoint(9.5F, -4F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[81].setRotationPoint(9.5F, -4F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[82].setRotationPoint(9.5F, -5F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[83].setRotationPoint(9.5F, -5F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[84].setRotationPoint(9.5F, -5F, -6F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bodyModel[85].setRotationPoint(10.5F, 1F, -6F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 111
		bodyModel[86].setRotationPoint(10.5F, 2F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 112
		bodyModel[87].setRotationPoint(10.5F, -8F, -6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 113
		bodyModel[88].setRotationPoint(10.5F, -6F, -6F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 114
		bodyModel[89].setRotationPoint(12.5F, 3F, -2F);
		bodyModel[89].rotateAngleZ = 0.6981317F;

		bodyModel[90].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 115
		bodyModel[90].setRotationPoint(-13.5F, -6F, -3F);
	}
}