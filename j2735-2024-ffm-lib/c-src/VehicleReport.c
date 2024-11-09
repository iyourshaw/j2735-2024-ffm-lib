/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "VehicleReport.h"

asn_TYPE_member_t asn_MBR_VehicleReport_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct VehicleReport, snapShot),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_RwmSnapShot,
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
		"snapShot"
		},
	{ ATF_POINTER, 1, offsetof(struct VehicleReport, wdmsFleetData),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_WDMSFleetData,
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
		"wdmsFleetData"
		},
};
static const int asn_MAP_VehicleReport_oms_1[] = { 1 };
static const ber_tlv_tag_t asn_DEF_VehicleReport_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_VehicleReport_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* snapShot */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 } /* wdmsFleetData */
};
asn_SEQUENCE_specifics_t asn_SPC_VehicleReport_specs_1 = {
	sizeof(struct VehicleReport),
	offsetof(struct VehicleReport, _asn_ctx),
	asn_MAP_VehicleReport_tag2el_1,
	2,	/* Count of tags in the map */
	asn_MAP_VehicleReport_oms_1,	/* Optional members */
	1, 0,	/* Root/Additions */
	2,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_VehicleReport = {
	"VehicleReport",
	"VehicleReport",
	&asn_OP_SEQUENCE,
	asn_DEF_VehicleReport_tags_1,
	sizeof(asn_DEF_VehicleReport_tags_1)
		/sizeof(asn_DEF_VehicleReport_tags_1[0]), /* 1 */
	asn_DEF_VehicleReport_tags_1,	/* Same as above */
	sizeof(asn_DEF_VehicleReport_tags_1)
		/sizeof(asn_DEF_VehicleReport_tags_1[0]), /* 1 */
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
	asn_MBR_VehicleReport_1,
	2,	/* Elements count */
	&asn_SPC_VehicleReport_specs_1	/* Additional specs */
};

