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
public class Modelflama<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ubran", "modelflama"), "main");
	public final ModelPart haed;
	public final ModelPart l_legs;
	public final ModelPart r_legs;

	public Modelflama(ModelPart root) {
		this.haed = root.getChild("haed");
		this.l_legs = root.getChild("l_legs");
		this.r_legs = root.getChild("r_legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition haed = partdefinition.addOrReplaceChild("haed",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(16, 21).addBox(-4.0F, -10.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(4.0F, -10.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 13).addBox(3.0F, -11.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-3.0F, -11.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(2.0F, -12.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-2.0F, -12.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(0.0F, -13.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition cube_r1 = haed.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 24).addBox(0.0F, -13.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = haed.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -12.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 17).addBox(-3.0F, -11.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 10)
						.addBox(2.0F, -12.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(3.0F, -11.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 19)
						.addBox(-4.0F, -10.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 20).addBox(4.0F, -10.0F, -4.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition l_legs = partdefinition.addOrReplaceChild("l_legs", CubeListBuilder.create().texOffs(29, 27).addBox(1.0F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition r_legs = partdefinition.addOrReplaceChild("r_legs", CubeListBuilder.create().texOffs(27, 0).addBox(-4.0F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		haed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.l_legs.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.r_legs.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.haed.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.haed.xRot = headPitch / (180F / (float) Math.PI);
	}
}
