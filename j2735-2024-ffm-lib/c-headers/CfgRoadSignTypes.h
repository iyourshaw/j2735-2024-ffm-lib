/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CfgRoadSignTypes_H_
#define	_CfgRoadSignTypes_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* CfgRoadSignTypes */
typedef struct CfgRoadSignTypes {
	BOOLEAN_t	*whiteOnGreen;	/* OPTIONAL */
	BOOLEAN_t	*blackOnYellow;	/* OPTIONAL */
	BOOLEAN_t	*blackOnOrange;	/* OPTIONAL */
	BOOLEAN_t	*whiteOnRed;	/* OPTIONAL */
	BOOLEAN_t	*blackOnWhite;	/* OPTIONAL */
	BOOLEAN_t	*octagon;	/* OPTIONAL */
	BOOLEAN_t	*eqlatTriangle;	/* OPTIONAL */
	BOOLEAN_t	*circle;	/* OPTIONAL */
	BOOLEAN_t	*pennant;	/* OPTIONAL */
	BOOLEAN_t	*pentagon;	/* OPTIONAL */
	BOOLEAN_t	*crossbuck;	/* OPTIONAL */
	BOOLEAN_t	*diamond;	/* OPTIONAL */
	BOOLEAN_t	*trapezoid;	/* OPTIONAL */
	BOOLEAN_t	*other;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CfgRoadSignTypes_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CfgRoadSignTypes;
extern asn_SEQUENCE_specifics_t asn_SPC_CfgRoadSignTypes_specs_1;
extern asn_TYPE_member_t asn_MBR_CfgRoadSignTypes_1[14];

#ifdef __cplusplus
}
#endif

#endif	/* _CfgRoadSignTypes_H_ */
#include "asn_internal.h"
