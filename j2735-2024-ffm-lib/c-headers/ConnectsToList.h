/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "MapData"
 * 	found in "asn/J2735-MapData-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ConnectsToList_H_
#define	_ConnectsToList_H_


#include "asn_application.h"

/* Including external dependencies */
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct Connection;

/* ConnectsToList */
typedef struct ConnectsToList {
	A_SEQUENCE_OF(struct Connection) list;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ConnectsToList_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ConnectsToList;
extern asn_SET_OF_specifics_t asn_SPC_ConnectsToList_specs_1;
extern asn_TYPE_member_t asn_MBR_ConnectsToList_1[1];
extern asn_per_constraints_t asn_PER_type_ConnectsToList_constr_1;

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "Connection.h"

#endif	/* _ConnectsToList_H_ */
#include "asn_internal.h"
