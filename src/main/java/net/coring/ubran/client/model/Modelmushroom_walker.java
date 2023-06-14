package net.coring.ubran.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmushroom_walker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ubran", "modelmushroom_walker"), "main");
	public final ModelPart head;
	public final ModelPart leg_left;
	public final ModelPart leg_right;

	public Modelmushroom_walker(ModelPart root) {
		this.head = root.getChild("head");
		this.leg_left = root.getChild("leg_left");
		this.leg_right = root.getChild("leg_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition het = head.addOrReplaceChild("het", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition bone5 = het.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2345F, -0.058F));
		PartDefinition bone = bone5.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -1.5155F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 31).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.95F, -5.25F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 32).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.25F, -4.25F, -1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 24).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.0F, -1.75F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 28).addBox(-1.5F, -1.25F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.9845F, -0.192F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone2 = bone5.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.7655F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.95F, -5.25F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 31).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.25F, -4.25F, -1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 20).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.0F, -1.75F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 27).addBox(-1.5F, -1.25F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.9845F, -0.192F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone3 = bone5.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(33, 20).addBox(-0.5F, -0.7655F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 9).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.95F, -5.25F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 12).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.25F, -4.25F, -1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(6, 27).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.0F, -1.75F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 27).addBox(-1.5F, -1.25F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.9845F, -0.192F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone4 = bone5.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, -0.7655F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r13 = bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 3).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.95F, -5.25F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 6).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.25F, -4.25F, -1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 24).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.0F, -1.75F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -1.25F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.9845F, -0.192F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone6 = het.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2345F, -0.058F));
		PartDefinition cube_r17 = bone6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 0).addBox(-3.5F, -1.0F, 0.25F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7377F, 3.6161F, -3.6797F, -0.5585F, 0.7854F, 0.0F));
		PartDefinition cube_r18 = bone6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 21).addBox(-2.5F, 0.0F, -0.55F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -1.2566F, 0.7854F, 0.0F));
		PartDefinition cube_r19 = bone6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -2.0F, -0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -0.9599F, 0.7854F, 0.0F));
		PartDefinition cube_r20 = bone6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9899F, 4.0135F, -1.5281F, -0.2321F, 0.7898F, 0.0988F));
		PartDefinition bone7 = het.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2345F, -0.058F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r21 = bone7.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 17).addBox(-3.5F, -1.0F, 0.25F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7377F, 3.6161F, -3.6797F, -0.5585F, 0.7854F, 0.0F));
		PartDefinition cube_r22 = bone7.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, 0.0F, -0.55F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -1.2566F, 0.7854F, 0.0F));
		PartDefinition cube_r23 = bone7.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -2.0F, -0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -0.9599F, 0.7854F, 0.0F));
		PartDefinition cube_r24 = bone7.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 33).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9899F, 4.0135F, -1.5281F, -0.2321F, 0.7898F, 0.0988F));
		PartDefinition bone8 = het.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2345F, -0.058F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 15).addBox(-3.5F, -1.0F, 0.25F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7377F, 3.6161F, -3.6797F, -0.5585F, 0.7854F, 0.0F));
		PartDefinition cube_r26 = bone8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(16, 18).addBox(-2.5F, 0.0F, -0.55F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -1.2566F, 0.7854F, 0.0F));
		PartDefinition cube_r27 = bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(6, 23).addBox(-1.0F, -2.0F, -0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -0.9599F, 0.7854F, 0.0F));
		PartDefinition cube_r28 = bone8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(6, 31).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9899F, 4.0135F, -1.5281F, -0.2321F, 0.7898F, 0.0988F));
		PartDefinition bone9 = het.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2345F, -0.058F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -1.0F, 0.25F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7377F, 3.6161F, -3.6797F, -0.5585F, 0.7854F, 0.0F));
		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(18, 3).addBox(-2.5F, 0.0F, -0.55F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -1.2566F, 0.7854F, 0.0F));
		PartDefinition cube_r31 = bone9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -2.0F, -0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7093F, 2.7366F, -1.6513F, -0.9599F, 0.7854F, 0.0F));
		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(18, 24).addBox(-0.5F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9899F, 4.0135F, -1.5281F, -0.2321F, 0.7898F, 0.0988F));
		PartDefinition hand_left = head.addOrReplaceChild("hand_left", CubeListBuilder.create().texOffs(22, 22).addBox(-0.4948F, 0.2374F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -3.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hand_right = head.addOrReplaceChild("hand_right", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4948F, -0.1452F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.65F, -2.75F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leg_left = partdefinition.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(29, 16).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leg_right = partdefinition.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(10, 29).addBox(1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
