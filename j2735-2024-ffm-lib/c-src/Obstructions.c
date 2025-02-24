/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadSafetyMessage"
 * 	found in "asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "Obstructions.h"

asn_TYPE_member_t asn_MBR_Obstructions_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct Obstructions, location),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_Position3D,
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
		"location"
		},
	{ ATF_POINTER, 1, offsetof(struct Obstructions, description),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_ITIS_ITIScodes,
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
		"description"
		},
};
static const int asn_MAP_Obstructions_oms_1[] = { 1 };
static const ber_tlv_tag_t asn_DEF_Obstructions_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_Obstructions_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* location */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 } /* description */
};
asn_SEQUENCE_specifics_t asn_SPC_Obstructions_specs_1 = {
	sizeof(struct Obstructions),
	offsetof(struct Obstructions, _asn_ctx),
	asn_MAP_Obstructions_tag2el_1,
	2,	/* Count of tags in the map */
	asn_MAP_Obstructions_oms_1,	/* Optional members */
	1, 0,	/* Root/Additions */
	2,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_Obstructions = {
	"Obstructions",
	"Obstructions",
	&asn_OP_SEQUENCE,
	asn_DEF_Obstructions_tags_1,
	sizeof(asn_DEF_Obstructions_tags_1)
		/sizeof(asn_DEF_Obstructions_tags_1[0]), /* 1 */
	asn_DEF_Obstructions_tags_1,	/* Same as above */
	sizeof(asn_DEF_Obstructions_tags_1)
		/sizeof(asn_DEF_Obstructions_tags_1[0]), /* 1 */
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
	asn_MBR_Obstructions_1,
	2,	/* Elements count */
	&asn_SPC_Obstructions_specs_1	/* Additional specs */
};

