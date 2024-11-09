/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "SensorDataSharingMessage_PositionOffsetXYZ.h"

asn_TYPE_member_t asn_MBR_SensorDataSharingMessage_PositionOffsetXYZ_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct SensorDataSharingMessage_PositionOffsetXYZ, offsetX),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_SensorDataSharingMessage_ObjectDistance,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"offsetX"
		},
	{ ATF_NOFLAGS, 0, offsetof(struct SensorDataSharingMessage_PositionOffsetXYZ, offsetY),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_SensorDataSharingMessage_ObjectDistance,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"offsetY"
		},
	{ ATF_POINTER, 1, offsetof(struct SensorDataSharingMessage_PositionOffsetXYZ, offsetZ),
		(ASN_TAG_CLASS_CONTEXT | (2 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_SensorDataSharingMessage_ObjectDistance,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"offsetZ"
		},
};
static const int asn_MAP_SensorDataSharingMessage_PositionOffsetXYZ_oms_1[] = { 2 };
static const ber_tlv_tag_t asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_SensorDataSharingMessage_PositionOffsetXYZ_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* offsetX */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 }, /* offsetY */
    { (ASN_TAG_CLASS_CONTEXT | (2 << 2)), 2, 0, 0 } /* offsetZ */
};
asn_SEQUENCE_specifics_t asn_SPC_SensorDataSharingMessage_PositionOffsetXYZ_specs_1 = {
	sizeof(struct SensorDataSharingMessage_PositionOffsetXYZ),
	offsetof(struct SensorDataSharingMessage_PositionOffsetXYZ, _asn_ctx),
	asn_MAP_SensorDataSharingMessage_PositionOffsetXYZ_tag2el_1,
	3,	/* Count of tags in the map */
	asn_MAP_SensorDataSharingMessage_PositionOffsetXYZ_oms_1,	/* Optional members */
	1, 0,	/* Root/Additions */
	-1,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ = {
	"PositionOffsetXYZ",
	"PositionOffsetXYZ",
	&asn_OP_SEQUENCE,
	asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1,
	sizeof(asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1)
		/sizeof(asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1[0]), /* 1 */
	asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1,	/* Same as above */
	sizeof(asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1)
		/sizeof(asn_DEF_SensorDataSharingMessage_PositionOffsetXYZ_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		SEQUENCE_constraint
	},
	asn_MBR_SensorDataSharingMessage_PositionOffsetXYZ_1,
	3,	/* Elements count */
	&asn_SPC_SensorDataSharingMessage_PositionOffsetXYZ_specs_1	/* Additional specs */
};

