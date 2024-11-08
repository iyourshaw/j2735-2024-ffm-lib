/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadSafetyMessage"
 * 	found in "asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CrossLinking_H_
#define	_CrossLinking_H_


#include "asn_application.h"

/* Including external dependencies */
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct AudioLink;
struct VisualLink;
struct EventIdentifier;

/* CrossLinking */
typedef struct CrossLinking {
	struct CrossLinking__audioLinks {
		A_SEQUENCE_OF(struct AudioLink) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *audioLinks;
	struct CrossLinking__visualLink {
		A_SEQUENCE_OF(struct VisualLink) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *visualLink;
	struct CrossLinking__rsmLink {
		A_SEQUENCE_OF(struct EventIdentifier) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *rsmLink;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CrossLinking_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CrossLinking;
extern asn_SEQUENCE_specifics_t asn_SPC_CrossLinking_specs_1;
extern asn_TYPE_member_t asn_MBR_CrossLinking_1[3];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "AudioLink.h"
#include "VisualLink.h"
#include "EventIdentifier.h"

#endif	/* _CrossLinking_H_ */
#include "asn_internal.h"
