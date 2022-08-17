package net.mcreator.ubran.client.model;

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

public class Modeldeer<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ubran", "modeldeer"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_leg_1;
	public final ModelPart left_leg_2;
	public final ModelPart right_leg_1;
	public final ModelPart right_leg_2;

	public Modeldeer(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_leg_1 = root.getChild("left_leg_1");
		this.left_leg_2 = root.getChild("left_leg_2");
		this.right_leg_1 = root.getChild("right_leg_1");
		this.right_leg_2 = root.getChild("right_leg_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(0, 17).addBox(-2.375F, -4.6679F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(0, 27).addBox(-1.375F, -1.6679F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.125F, 10.1679F, -5.75F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, -3.1679F, 1.75F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.125F, -3.1679F, 1.75F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -13.0F, -5.5F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(20, 17).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -4.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -12.75F, 5.25F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(15, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_leg_1 = partdefinition.addOrReplaceChild("left_leg_1",
				CubeListBuilder.create().texOffs(26, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 17.0F, -3.5F));
		PartDefinition left_leg_2 = partdefinition.addOrReplaceChild("left_leg_2",
				CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 17.0F, 4.5F));
		PartDefinition right_leg_1 = partdefinition.addOrReplaceChild("right_leg_1",
				CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 17.0F, -3.5F));
		PartDefinition right_leg_2 = partdefinition.addOrReplaceChild("right_leg_2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 17.0F, 4.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg_2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_leg_1.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg_1.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.left_leg_2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
