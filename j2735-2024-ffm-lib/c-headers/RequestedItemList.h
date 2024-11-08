/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CommonSafetyRequest"
 * 	found in "asn/J2735-CommonSafetyRequest-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RequestedItemList_H_
#define	_RequestedItemList_H_


#include "asn_application.h"

/* Including external dependencies */
#include "RequestedItem.h"
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"

#ifdef __cplusplus
extern "C" {
#endif

/* RequestedItemList */
typedef struct RequestedItemList {
	A_SEQUENCE_OF(RequestedItem_t) list;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RequestedItemList_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RequestedItemList;
extern asn_SET_OF_specifics_t asn_SPC_RequestedItemList_specs_1;
extern asn_TYPE_member_t asn_MBR_RequestedItemList_1[1];
extern asn_per_constraints_t asn_PER_type_RequestedItemList_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _RequestedItemList_H_ */
#include "asn_internal.h"
