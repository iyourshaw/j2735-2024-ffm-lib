/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Axles_H_
#define	_Axles_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Axles */
typedef struct Axles {
	long	 totalAxles;
	long	*frontAxles;	/* OPTIONAL */
	long	*rearAxles;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} Axles_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Axles;
extern asn_SEQUENCE_specifics_t asn_SPC_Axles_specs_1;
extern asn_TYPE_member_t asn_MBR_Axles_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _Axles_H_ */
#include "asn_internal.h"